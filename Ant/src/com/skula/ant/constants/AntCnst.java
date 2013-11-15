package com.skula.ant.constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class AntCnst  {
	public static final String MENU_HEADER_DIR_LABEL = "Directories";
	public static final int MENU_HEADER_DIR_ID = 0;
	public static final String MENU_HEADER_APP_LABEL = "Applications";
	public static final int MENU_HEADER_APP = 1;
	public static final String MENU_HEADER_SCRIPT_LABEL = "Scripts";
	public static final int MENU_HEADER_SCRIPT_ID = 2;
	
	public static List<String> MENU_HEADERS = new ArrayList<String>();
	public static HashMap<String, List<String>> MENU_ITEMS = new HashMap<String, List<String>>();
	
	static{
		MENU_HEADERS = new ArrayList<String>();
        MENU_ITEMS = new HashMap<String, List<String>>();
 
        // Adding child data
        MENU_HEADERS.add(MENU_HEADER_DIR_LABEL);
        MENU_HEADERS.add(MENU_HEADER_APP_LABEL);
        MENU_HEADERS.add(MENU_HEADER_SCRIPT_LABEL);
 
        // Adding child data
        List<String> dirs = new ArrayList<String>();
        dirs.add("Home");
        dirs.add("Music");
        dirs.add("TV Shows");
        dirs.add("Downloads");
 
        List<String> apps = new ArrayList<String>();
        apps.add("Chrome");
        apps.add("Eclipse");
 
        List<String> scripts = new ArrayList<String>();
        scripts.add("Sort episodes");
		scripts.add("WoL");
		scripts.add("Shutdown");
 
        MENU_ITEMS.put(MENU_HEADERS.get(MENU_HEADER_DIR_ID), dirs); 
        MENU_ITEMS.put(MENU_HEADERS.get(MENU_HEADER_APP), apps);
        MENU_ITEMS.put(MENU_HEADERS.get(MENU_HEADER_SCRIPT_ID), scripts);
	}
}