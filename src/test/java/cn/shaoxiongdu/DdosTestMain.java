/*
 * 版权所有 (c) 2021. 写Bug的小杜 <https://github.com/blog>  保留所有权利
 */

package cn.blog;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DdosTestMain {

    public static void main(String[] args) throws IOException, InterruptedException {

        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        while (true) {
            process = runtime.exec("ping www.blog.cn");
            System.out.println(process.toString());
        }
    }

}
