package org.crayeres.decorator;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2017/12/13 0013.
 */
public class LowerCaseInputStreamTest {

    @Test
    public void testReadFile() {
        try {
            LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:/test.txt")));

            String result = "";
            int c;
            while ((c = lowerCaseInputStream.read()) > 0) {
                result += (char) c;
            }
            Assert.assertEquals(result, "i know the decorator pattern therefore i rule!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
