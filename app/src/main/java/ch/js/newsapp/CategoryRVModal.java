package ch.js.newsapp;

public class CategoryRVModal {
    private String categoryString;
    private String categoryImageUrl;

    public CategoryRVModal(String categoryString, String categoryImageUrl) {
        this.categoryString = categoryString;
        this.categoryImageUrl = categoryImageUrl;
    }

    public String getCategoryString() {
        return categoryString;
    }

    public void setCategoryString(String categoryString) {
        this.categoryString = categoryString;
    }

    public String getCategoryImageUrl() {
        return categoryImageUrl;
    }

    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }


    public String getCategory() {
        return null;
    }
}



