package com.example.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class Books
{
    //Defining book id as primary key
    @Id
    @Column
    private int book_id;
    @Column
    private String book_name;
    @Column
    private String author;
    @Column
    private int price;
    public int getBookid()
    {
        return book_id;
    }
    public void setBookid(int bookid)
    {
        this.book_id = bookid;
    }
    public String getBookname()
    {
        return book_name;
    }
    public void setBookname(String bookname)
    {
        this.book_name = bookname;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}
