package com.saikrishna.s;

public class Book {
  private String name;
  private String author;
  private String text;

  public Book(String name, String author, String text) {
    this.name = name;
    this.author = author;
    this.text = text;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String replaceWordInText(String word, String replacementWord) {
    return text.replaceAll(word, replacementWord);
  }

  public boolean inWordInText(String word) {
    return text.contains(word);
  }

}
