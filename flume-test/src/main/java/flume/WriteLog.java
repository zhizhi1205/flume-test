package flume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by yuezz on 2016-3-10.
 */
public class WriteLog {

	protected static final Logger logger = LoggerFactory
			.getLogger(WriteLog.class);

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();

		int i = 0;
		while (i < 10000) {
			logger.info(String.valueOf(new Date().getTime()));
			i++;
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		
	}

}