package com.example.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mPronounceId;

    public Word(String defaultTranslation, String mMiwokTranslation,int pronouceId) {
        mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mPronounceId = pronouceId;
    }
      //constructor overloading or polymorphism
    public Word(String defaultTranslation, String MiwokTranslation, int imageResourceId, int pronouceId) {
        this.mMiwokTranslation = MiwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageResourceId = imageResourceId;
        this.mPronounceId = pronouceId;
    }

    public String getDefault_translation() {
        return mDefaultTranslation;
    }

    public String getMiwok_translation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getPronouceId(){return mPronounceId;}

    public boolean hasImage(){return mImageResourceId != NO_IMAGE_PROVIDED;}




}
