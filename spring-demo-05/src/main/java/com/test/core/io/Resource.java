package com.test.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源输入流
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
