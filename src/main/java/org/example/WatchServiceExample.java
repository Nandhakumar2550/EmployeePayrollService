package org.example;

import java.nio.file.*;

public class WatchServiceExample {

    public static void watchDirectory() throws Exception {

        WatchService watcher = FileSystems.getDefault().newWatchService();

        Path dir = Paths.get(".");

        // register events
        dir.register(watcher,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE);

        System.out.println("Watching directory...");

        while (true) {

            WatchKey key = watcher.take();

            for (WatchEvent<?> event : key.pollEvents()) {

                System.out.println("Event: " + event.kind()
                        + " File: " + event.context());
            }

            key.reset();
        }
    }
}