package com.example.demo.dataprovider.entities;

import java.io.Serializable;

public interface Persistable<PK extends Serializable> {

    public abstract PK getId();

    public abstract void setId(PK id);

}
