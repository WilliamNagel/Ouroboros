package com.luorrak.ouroboros.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;


/**
 * Ouroboros - An 8chan browser
 * Copyright (C) 2015  Luorrak
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class JsonParser {
    private final String LOG_TAG = JsonParser.class.getSimpleName();

    //JSON CATALOG NODE NAMES
    private static final String CATALOG_NO = "no";
    private static final String CATALOG_FILENAME = "filename";
    private static final String CATALOG_TIM = "tim"; //Image thumbnail location
    private static final String CATALOG_EXT = "ext"; //image filename extension .jpg .png etc
    private static final String CATALOG_SUB = "sub"; //Title
    private static final String CATALOG_COM = "com"; //Comment
    private static final String CATALOG_REPLIES = "replies"; //reply count
    private static final String CATALOG_IMAGE = "images"; //image reply count
    private static final String CATALOG_OMITTED_IMAGES = "omitted_images"; //image reply count
    private static final String CATALOG_STICKY = "sticky";
    private static final String CATALOG_LOCKED = "locked";
    private final String CATALOG_EMBED = "embed";

    //break the catalog into seperate pages elsewhere and submit them here. Might be able to just submit the object over for less complexity
    public String getCatalogNo(JsonObject catalogThreadJson){
        return catalogThreadJson.get(CATALOG_NO).getAsString();
    }

    public String getCatalogFilename(JsonObject catalogThreadJson){
        if (catalogThreadJson.get(CATALOG_FILENAME) != null){
            return catalogThreadJson.get(CATALOG_FILENAME).getAsString();
        } else {
            return null;
        }
    }

    public Integer getCatalogSticky(JsonObject catalogThreadJson){
        return catalogThreadJson.get(CATALOG_STICKY).getAsInt();
    }

    public Integer getCatalogLocked(JsonObject catalogThreadJson){
        return catalogThreadJson.get(CATALOG_LOCKED).getAsInt();
    }
    public String getCatalogSub(JsonObject catalogThreadJson){
        if (catalogThreadJson.get(CATALOG_SUB) != null){
            return catalogThreadJson.get(CATALOG_SUB).getAsString();
        }else {
            return null;
        }
    }

    public String getCatalogCom(JsonObject catalogThreadJson){
        if(catalogThreadJson.get(CATALOG_COM) != null){
            return catalogThreadJson.get(CATALOG_COM).getAsString();
        } else {
            return null;
        }
    }

    public Integer getCatalogReplies(JsonObject catalogThreadJson){
        return catalogThreadJson.get(CATALOG_REPLIES).getAsInt();
    }

    public Integer getCatalogImageReplyCount(JsonObject catalogThreadJson) {
        int shownImages = catalogThreadJson.get(CATALOG_IMAGE).getAsInt();
        int ommitedImages =  catalogThreadJson.get(CATALOG_OMITTED_IMAGES).getAsInt();
        return shownImages + ommitedImages;
    }

    public String getCatalogTim(JsonObject catalogThreadJson){
        if (catalogThreadJson.get(CATALOG_TIM) != null){
            return catalogThreadJson.get(CATALOG_TIM).getAsString();
        } else {
            return null;
        }
    }

    public String getCatalogExt(JsonObject catalogThreadJson){
        if (catalogThreadJson.get(CATALOG_EXT) != null){
            return catalogThreadJson.get(CATALOG_EXT).getAsString();
        } else {
            return null;
        }
    }

    public String getCatalogEmbed(JsonObject threadJson){
        if (threadJson.get(CATALOG_EMBED) != null){
            return threadJson.get(CATALOG_EMBED).getAsString();
        }else {
            return null;
        }
    }



    private final String THREAD_BOAORD = "";
    private final String THREAD_RESTO = "resto";
    private final String THREAD_NO = "no";
    private final String THREAD_FILENAME = "filename";
    private final String THREAD_TIM = "tim";
    private final String THREAD_EXT = "ext";
    private final String THREAD_EXTRA_FILES = "extra_files";
    private final String THREAD_SUB = "sub";
    private final String THREAD_COM = "com";
    private final String THREAD_NAME = "name";
    private final String THREAD_TRIP = "trip";
    private final String THREAD_TIME = "time";
    private final String THREAD_LAST_MODIFIED = "last_modified";
    private final String THREAD_ID = "id";
    private final String THREAD_EMBED = "embed";
    private final String THREAD_IMAGE_HEIGHT = "h";
    private final String THREAD_IMAGE_WIDTH = "w";

    public String getThreadResto(JsonObject threadJson){
        String resto = threadJson.get(THREAD_RESTO).getAsString();
        if (resto.equals("0")){
            return getThreadNo(threadJson);
        } else {
            return resto;
        }
    }

    public String getThreadNo(JsonObject threadJson){
        return threadJson.get(THREAD_NO).getAsString();
    }

    public String getThreadFilename(JsonObject threadJson){
        if (threadJson.get(THREAD_FILENAME) != null){
            return threadJson.get(THREAD_FILENAME).getAsString();
        }else {
            return null;
        }
    }

    public String getThreadTim(JsonObject threadJson){
        if (threadJson.get(THREAD_TIM) != null){
            return threadJson.get(THREAD_TIM).getAsString();
        }else {
            return null;
        }
    }

    public String getThreadExt(JsonObject threadJson){
        if (threadJson.get(THREAD_EXT) != null){
            return threadJson.get(THREAD_EXT).getAsString();
        }else {
            return null;
        }
    }

    public String getThreadSub(JsonObject threadJson){
        if (threadJson.get(THREAD_SUB) != null){
            return threadJson.get(THREAD_SUB).getAsString();
        }else {
            return null;
        }
    }

    public String getThreadCom(JsonObject threadJson){
        if (threadJson.get(THREAD_COM) != null){
            return threadJson.get(THREAD_COM).getAsString();
        }else {
            return null;
        }
    }

    public String getThreadName(JsonObject threadJson){
        if (threadJson.get(THREAD_NAME) != null){
            return threadJson.get(THREAD_NAME).getAsString();
        }else {
            return null;
        }
    }

    public String getThreadTrip(JsonObject threadJson){
        if (threadJson.get(THREAD_TRIP) != null){
            return threadJson.get(THREAD_TRIP).getAsString();
        }else {
            return null;
        }
    }

    public String getThreadTime(JsonObject threadJson){
        return threadJson.get(THREAD_TIME).getAsString();
    }

    public String getThreadLastModified(JsonObject threadJson){
        if (threadJson.get(THREAD_LAST_MODIFIED) != null){
            return threadJson.get(THREAD_LAST_MODIFIED).getAsString();
        }else {
            return null;
        }
    }

    public String getThreadId(JsonObject threadJson){
        if (threadJson.get(THREAD_ID) != null){
            return threadJson.get(THREAD_ID).getAsString();
        }else {
            return null;
        }
    }

    public void checkExtraFiles(String label, ArrayList<String> value, JsonObject threadJson){
        if (threadJson.has(THREAD_EXTRA_FILES)){
            JsonArray extraFiles = threadJson.getAsJsonArray(THREAD_EXTRA_FILES);
            for (JsonElement fileElement : extraFiles){
                JsonObject file = fileElement.getAsJsonObject();
                value.add(file.get(label).getAsString());
            }
        }
    }

    public String getThreadEmbed(JsonObject threadJson){
        if (threadJson.get(THREAD_EMBED) != null){
            return threadJson.get(THREAD_EMBED).getAsString();
        }else {
            return null;
        }
    }

    public String getThreadImageHeight(JsonObject threadJson) {
        if (threadJson.get(THREAD_IMAGE_HEIGHT) != null){
            return threadJson.get(THREAD_IMAGE_HEIGHT).getAsString();
        }else {
            return "0";
        }
    }

    public String getThreadImageWidth(JsonObject threadJson) {
        if (threadJson.get(THREAD_IMAGE_WIDTH) != null){
            return threadJson.get(THREAD_IMAGE_WIDTH).getAsString();
        }else {
            return "0";
        }
    }
}