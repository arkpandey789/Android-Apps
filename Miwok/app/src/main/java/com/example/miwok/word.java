package com.example.miwok;

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceID;

    public word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResource){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceID=audioResource;
    }
    public word(String defaultTranslation,String miwokTranslation,int audioResource){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceID=audioResource;

    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean has_Image()
    {
       return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceID(){
        return mAudioResourceID;
    }
}
