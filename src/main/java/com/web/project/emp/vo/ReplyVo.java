package com.web.project.emp.vo;

public class ReplyVo {
	private String content, regdate, id;
	private int replyno, boardno, parentno, replyorder;

	public int getReplyno() {
		return replyno;
	}

	public void setReplyno(int replyno) {
		this.replyno = replyno;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getBoardno() {
		return boardno;
	}

	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}

	public int getParentno() {
		return parentno;
	}

	public void setParentno(int parentno) {
		this.parentno = parentno;
	}

	public int getReplyorder() {
		return replyorder;
	}

	public void setReplyorder(int replyorder) {
		this.replyorder = replyorder;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
