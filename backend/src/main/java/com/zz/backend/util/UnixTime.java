/*
 * @Date: 2020-04-01 20:22:51
 * 
 * @Author: zero
 * 
 * @LastEditTime: 2020-04-24 21:03:58
 * 
 * @Description:
 */
package com.zz.backend.util;

import java.math.BigInteger;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class UnixTime {
  /**
   * 时间戳转日期字符串
   * 
   * @param seconds
   * @param format
   * @return String
   */
  public static String timeStampToDate(String seconds) {
    String format = "yyyy-MM-dd HH:mm";
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    return sdf.format(new Date(Long.valueOf(seconds + "000")));
  }

  /**
   * @description:
   * @param {type}
   * @return: BigInteger
   */
  public static BigInteger getNowTimeStamp() {
    long time = System.currentTimeMillis() / 1000;
    BigInteger nowTimeStamp = BigInteger.valueOf(time);
    return nowTimeStamp;
  }
}
