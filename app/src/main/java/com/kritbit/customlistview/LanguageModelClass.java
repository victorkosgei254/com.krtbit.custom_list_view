package com.kritbit.customlistview;

public class LanguageModelClass {
    private String language_name, language_use;
    private int language_logo;

    public LanguageModelClass(String language_name, String language_use, int language_logo) {
        this.language_name = language_name;
        this.language_use = language_use;
        this.language_logo = language_logo;
    }

    public String getLanguage_name() {
        return language_name;
    }

    public void setLanguage_name(String language_name) {
        this.language_name = language_name;
    }

    public String getLanguage_use() {
        return language_use;
    }

    public void setLanguage_use(String language_use) {
        this.language_use = language_use;
    }

    public int getLanguage_logo() {
        return language_logo;
    }

    public void setLanguage_logo(int language_logo) {
        this.language_logo = language_logo;
    }
}
