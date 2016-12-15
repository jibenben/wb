package cn.edu.bjtu.weibo.model;

public class WeiboSR {
	private Weibo weibo;
	private int[] highlighIndex;
	public Weibo getWeibo() {
		return weibo;
	}
	public void setWeibo(Weibo weibo) {
		this.weibo = weibo;
	}
	public int[] getHighlighIndex() {
		return highlighIndex;
	}
	public void setHighlighIndex(int[] highlighIndex) {
		this.highlighIndex = highlighIndex;
	}
}
