package com.cha.allen.app.webapps.framework;

import java.util.List;
import java.util.Map;

/**
 * This is the Cache Manager Interface. 
 * Cahe Manager implementation class should implement all methods
 * defined by this interface.
 * @see
 * @copyright
 * @version
 * @author Sapient Corporation
 * @history
 * 
 */
public interface IWebApplicationCacheManager {
	/**
	 * This method is called at the bean initialization time (declared inside 
	 * 							applicationContextStaticDataConfiguration.xml).
	 * This method is also called to refresh cache.
	 */	
	public void initializeCache();
	
	/**
	 * This method returns static data from cache based on the key passed to it
	 * @param staticDataKey to fetch data from cache
	 */	
	public List getStaticDataList(String keY);
	
	/**
	 * This methos is used to refresh cache
	 */
	public void refreshCache();
	
	/**
	 * This method is used to fetch a Map of Map from staticDataCache based on 
	 * the key passed
	 * @param String mapOfMapKey Key to fetch map of map from cache
	 */
	public Map<String,Map<String,String>> getMapOfMap(String mapOfMapKey);
}
