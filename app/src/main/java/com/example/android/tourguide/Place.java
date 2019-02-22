package com.example.android.tourguide;

public class Place {

    private int mImageResourceId;

    private String mPlaceName;

    private float mRating = -1f;

    private String mPhysicalAddress;

    private String mContactNumber;

    private String mWebAddress;

    private String mOtherDetails;

    public Place(String placeName, String physicalAddress, String webAddress,
                 String otherDetails, int imageResourceId) {

        mPlaceName = placeName;
        mPhysicalAddress = physicalAddress;
        mWebAddress = webAddress;
        mOtherDetails = otherDetails;
        mImageResourceId = imageResourceId;

    }

    public Place(String placeName, String address, String otherDetails,
                 int imageResourceId, String timings) {
        mPlaceName = placeName;
        mPhysicalAddress = address;
        mOtherDetails = otherDetails;
        mImageResourceId = imageResourceId;
    }

    public Place(String placeName, float rating, String physicalAddress, String contactNumber,
                 String webAddress, String otherDetails, int imageResourceId) {

        mPlaceName = placeName;
        mRating = rating;
        mPhysicalAddress = physicalAddress;
        mContactNumber = contactNumber;
        mWebAddress = webAddress;
        mOtherDetails = otherDetails;
        mImageResourceId = imageResourceId;

    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public float getRating() {
        return mRating;
    }

    public String getPhysicalAddress() {
        return mPhysicalAddress;
    }

    public String getContactNumber() {
        return mContactNumber;
    }

    public String getWebAddress() {
        return mWebAddress;
    }

    public String getOtherDetails() {
        return mOtherDetails;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasRating() {
        if (mRating != -1) {
            return true;
        } else {
            return false;
        }
    }

}
