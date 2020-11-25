package com.example.todolist;

import androidx.annotation.NonNull;

public class Todo {

    private String name;
    private String description;
   private int iconIndex;
    //private boolean ch;




    public Todo(String name, String description , int iconIndex ) {
 //       , boolean ch
        this.name = name;
        this.description=description;
       this.iconIndex=iconIndex;
        //this.ch = ch;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIconIndex() {
        return iconIndex;
    }

    public void setIconIndex(int iconIndex) {
        this.iconIndex = iconIndex;
    }
    //public void setCh(boolean ch) {
      //  this.ch = ch;
    //}

    //public boolean isCh() {
      //  return ch;
    //}
    @NonNull
    @Override
    public String toString(){
        return getName();
    }
}
