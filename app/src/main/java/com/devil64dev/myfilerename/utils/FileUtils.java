package com.devil64dev.myfilerename.utils;

import android.content.Context;
import android.content.res.Resources;

import com.devil64dev.myfilerename.R;

import java.io.File;

/**
 * <h1>FileUtils</h1>
 * This class allow play with files
 *
 * @author Devil64-Dev
 * @version 1
 * @since 2020-05-27
 */
public class FileUtils {
    private String CURRENT_WORK_PATH;
    private int error_code;
    private Context context;

    // set and get for error_code
    public int getErrorCode(){
        return this.error_code;
    }

    // Initial path to work
    FileUtils(String path_name, Context mContext) {
        this.CURRENT_WORK_PATH = path_name;
        this.context = mContext;
    }

    private File [] getFiles(){
        File work_path = new File(this.CURRENT_WORK_PATH);
        return work_path.listFiles();
    }

    private String [] getFilesName(){
        File work_path = new File(this.CURRENT_WORK_PATH);
        return work_path.list();
    }

    private String [] getFilesName(int absolute_path){
        File work_path = new File(this.CURRENT_WORK_PATH);
        return getAbsolutePath(work_path.list(), this.CURRENT_WORK_PATH);
    }

    private String [] getAbsolutePath(String[] list, String root_path){
        String [] list_files;
        if (list.length == 0){
            this.error_code = 1;  // Indicates that list length are null or 0
            // Add error message
            Resources res = context.getResources();
            list_files = new String[1];
            list_files[0] = res.getString(R.string.file_utils_no_files_err);
        }else {
            list_files = new String[list.length];
            for (int index=0;index < list.length; index++){
                list_files[index] = root_path+"/"+list[index];
            }
        }

        return list_files;
    }
}
