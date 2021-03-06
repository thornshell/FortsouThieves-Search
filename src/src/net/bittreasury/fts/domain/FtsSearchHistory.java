// default package
// Generated 2018-4-1 21:37:58 by Hibernate Tools 5.2.8.Final
package src.net.bittreasury.fts.domain;

/**
 * FtsSearchHistory generated by hbm2java
 */
public class FtsSearchHistory implements java.io.Serializable {

	private Integer id;
	private String keyword;
	private int searchTimes;

	public FtsSearchHistory() {
	}

	public FtsSearchHistory(String keyword, int searchTimes) {
		this.keyword = keyword;
		this.searchTimes = searchTimes;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getSearchTimes() {
		return this.searchTimes;
	}

	public void setSearchTimes(int searchTimes) {
		this.searchTimes = searchTimes;
	}

}
