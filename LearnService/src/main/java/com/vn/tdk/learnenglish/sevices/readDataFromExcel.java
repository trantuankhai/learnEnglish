package com.vn.tdk.learnenglish.sevices;

import java.io.IOException;
import java.util.List;


public interface readDataFromExcel {
	List getDataFromFile(String urlFile)throws IOException;
}
