/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.database;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DatabaseConnection {

	private String url;
	private String name;
	private String password;
	private List<String> lists;
	private Map<String, String> maps;
	private Properties props;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public void createConnection() {

		System.out.println("Url : " + this.url);
		System.out.println("Username : " + this.name);
		System.out.println("Password : " + this.password);

		System.out.println("Liste içindekiler : ");
		for (String list : lists) {
			System.out.println("\t - " + list);
		}

		System.out.println("Map içindekiler : ");

		Set<String> keys = this.maps.keySet();

		for (String key : keys) {
			System.out.println("\t - " +key +" : "+ maps.get(key));
		}

		System.out.println("Props içindekiler : ");
		Set<String> keyProps = this.props.stringPropertyNames();
		for (String propsKey : keyProps) {
			System.out.println("\t - " + propsKey + " : " + this.props.getProperty(propsKey));
		}

		System.out.println("Bağlantı kuruldu");
	}

	public void terminateConnection() {
		System.out.println("Bağlantı sonlandırıldı");
	}

}
