package com.company.lambda;

public class Document implements Printable {
    private String content;
    public void print() {
        System.out.println(content);
    }

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
