package com.shu.core.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 判断对象是否为空的工具类
 * @author shu
 *
 */
public class EmptyUtil {
	/**
	 * @方法名    对于String类型的非空判断
	 * @功能说明 对于String类型的非空判断
	 * @param str
	 * @return boolean true-为空 ， false-不为空
	 */
	public static boolean isNullOrEmpty(String str){
		if(str == null || "".equals(str.trim()) || "null".equalsIgnoreCase(str.trim()) 
				|| "undefined".equalsIgnoreCase(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * @方法名    对于StringBuffer类型的非空判断
	 * @功能说明 对于StringBuffer类型的非空判断
	 * @param str
	 * @return boolean true-为空 ， false-不为空
	 */
	public static boolean isNullOrEmpty(StringBuffer str){
		return (str==null || str.length()==0);
	}
	/**
	 * @方法名    对于String数组类型的非空判断
	 * @功能说明 对于String数组类型的非空判断
	 * @param str
	 * @return boolean true-为空 ， false-不为空
	 */
	public static boolean isNullOrEmpty(String[] str){
		return (str==null || str.length==0);
	}
	/**
	 * @方法名    对于Long类型的非空判断
	 * @功能说明 对于Long类型的非空判断
	 * @param str
	 * @return boolean true-为空 或者为0， false-不为空或大于0
	 */
	public static boolean isNullOrEmpty(Long longTime){
		return (longTime==null || longTime<=0);
	}
	/**
	 * @方法名    对于Object类型的非空判断
	 * @功能说明 对于Object类型的非空判断
	 * @param str
	 * @return boolean true-为空， false-不为空
	 */
	public static boolean isNullOrEmpty(Object obj){
		return (obj==null || "".equals(obj));
	}
	/**
	 * @方法名    对于Object数组类型的非空判断
	 * @功能说明 对于Object数组类型的非空判断
	 * @param str
	 * @return boolean true-为空， false-不为空
	 */
	public static boolean isNullOrEmpty(Object[] obj){
		return (obj==null || obj.length==0);
	}
	/**
	 * @方法名    对于Collection<?>类型的非空判断
	 * @功能说明 对于Collection<?>类型的非空判断
	 * @param str
	 * @return boolean true-为空， false-不为空
	 */
	public static boolean isNullOrEmpty(Collection<?> collection){
		return (collection==null || collection.isEmpty());
	}
	/**
	 * @方法名    对于Map类型的非空判断
	 * @功能说明 对于Map类型的非空判断
	 * @param str
	 * @return boolean true-为空， false-不为空
	 */
	public static boolean isNullOrEmpty(Map<?,?> map){
		return (map==null || map.isEmpty());
	}
	/**
	 * @方法名    removeNullUnit
	 * @功能说明 	删除集合中的空元素
	 * @param str
	 * @return
	 */
	public static <T> List<T> removeNullUnit(List<T> xllxList){
		List<T> need=new ArrayList<T>();
		for (int i = 0; i < xllxList.size(); i++) {
			if(!isNullOrEmpty(xllxList.get(i))){
				need.add(xllxList.get(i));
			}
		}
		return need;
	}
}
