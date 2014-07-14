/*
 * Copyright (c) 2005 Aetrion LLC.
 */
package com.googlecode.flickrjandroid.photosets;

import java.util.Collection;

/**
 * Photoset collection.  This class is required instead of a basic Collection object because of the cancreate flag.
 *
 * @author Anthony Eden
 */
public class Photosets {
    private static final long serialVersionUID = 12L;

    private boolean canCreate;
    private Collection<Photoset> photosets;

    private int page;
    private int pages;
    private int perPage;
    private int total;
    
    public Photosets() {

    }

    public boolean isCanCreate() {
        return canCreate;
    }

    public void setCanCreate(boolean canCreate) {
        this.canCreate = canCreate;
    }

    public Collection<Photoset> getPhotosets() {
        return photosets;
    }

    public void setPhotosets(Collection<Photoset> photosets) {
        this.photosets = photosets;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPage(String page) {
        if (page != null && page.length() != 0) {
            setPage(Integer.parseInt(page));
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPages(String pages) {
        if (pages != null && pages.length() != 0) {
            setPages(Integer.parseInt(pages));
        }
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public void setPerPage(String perPage) {
        if (perPage != null && perPage.length() != 0) {
            setPerPage(Integer.parseInt(perPage));
        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotal(String total) {
        if (total != null && total.length() != 0) {
            setTotal(Integer.parseInt(total));
        }
    }
}
