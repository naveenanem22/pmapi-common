package com.pc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attachment {
	@JsonProperty("id")
	private int id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("size")
	private long size;

	@JsonProperty("fileType")
	private String fileType;

	@JsonProperty("downloadUri")
	private String downloadUri;

	public Attachment() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getDownloadUri() {
		return downloadUri;
	}

	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}

	@Override
	public String toString() {
		return "Attachment [id=" + id + ", name=" + name + ", size=" + size + ", fileType=" + fileType
				+ ", downloadUri=" + downloadUri + "]";
	}

}
