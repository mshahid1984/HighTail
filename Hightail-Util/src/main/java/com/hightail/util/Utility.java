package com.hightail.util;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by mshahid on 5/29/14.
 */
public class Utility {

    public static InputStream openFile(String filename)
    {
        InputStream in = null;
        try
        {
            in = new FileInputStream(filename);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return in;
    }
}
