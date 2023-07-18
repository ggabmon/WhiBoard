package article.model;

public class Article {
	private int article_no;
	private String writer_id;
	private String writer_name;
	private String title;
	private String regdate;
	private String moddate;
	private int read_cnt;
	
	public int getArticle_no() {
		return article_no;
	}
	public String getWriter_id() {
		return writer_id;
	}
	public String getWriter_name() {
		return writer_name;
	}
	public String getTitle() {
		return title;
	}
	public String getRegdate() {
		return regdate;
	}
	public String getModdate() {
		return moddate;
	}
	public int getRead_cnt() {
		return read_cnt;
	}
	@Override
	public String toString() {
		return "Article [article_no=" + article_no + ", writer_id=" + writer_id + ", writer_name=" + writer_name
				+ ", title=" + title + ", regdate=" + regdate + ", moddate=" + moddate + ", read_cnt=" + read_cnt + "]";
	}
	public Article(int article_no, String writer_id, String title, String regdate,
			int read_cnt) {
		this.article_no = article_no;
		this.writer_id = writer_id;
		this.title = title;
		this.regdate = regdate;
		this.read_cnt = read_cnt;
	}
	public Article(int article_no, String writer_id, String title, String regdate, String moddate,
			int read_cnt) {
		super();
		this.article_no = article_no;
		this.writer_id = writer_id;
		this.title = title;
		this.regdate = regdate;
		this.moddate = moddate;
		this.read_cnt = read_cnt;
	}
	
	
}
