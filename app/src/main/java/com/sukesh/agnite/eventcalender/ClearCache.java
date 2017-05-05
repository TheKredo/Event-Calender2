package com.sukesh.agnite.eventcalender;

import android.app.Application;

import java.io.File;

/**
 * Created by mrsp7 on 05-05-2017.
 */
//To clear the cache so that we can login through another user
// i.e. we can see events of another user account in the smartphone
public class ClearCache extends Application {

    private static ClearCache instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static ClearCache getInstance() {
        return instance;
    }

    public void clearApplicationData() {
        File cacheDirectory = getCacheDir();
        File applicationDirectory = new File(cacheDirectory.getParent());
        if (applicationDirectory.exists()) {
            String[] fileNames = applicationDirectory.list();
            for (String fileName : fileNames) {
                if (!fileName.equals("lib")) {
                    deleteFile(new File(applicationDirectory, fileName));
                }
            }
        }
    }

    public static boolean deleteFile(File file) {
        boolean deletedAll = true;
        if (file != null) {
            if (file.isDirectory()) {
                String[] children = file.list();
                for (int i = 0; i < children.length; i++) {
                    deletedAll = deleteFile(new File(file, children[i])) && deletedAll;
                }
            } else {
                deletedAll = file.delete();
            }
        }

        return deletedAll;
    }
}
