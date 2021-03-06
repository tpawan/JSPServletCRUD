package com.soft.application.model;
/*

 * Item.java
 *
 * Generated with Matisse Schema Definition Language 9.1.10
 * Generation date: Sat Apr 07 17:57:56 2018
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

import com.matisse.reflect.*;

/**
 * <code>Item</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class Item extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.10
     * Generation Date: Sat Apr 07 17:57:56 2018
     */

    /*
     * Class variables and methods
     */

    /** Class <code>Item</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("Item"));

    /**
     * Gets the <code>Item</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public Item(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected Item(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(Item.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, Item.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(Item.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, Item.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'lotNumber' */

    /** Attribute <code>lotNumber</code> cache ID */
    private static int lotNumberCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("lotNumber",CID));

    /**
     * Gets the <code>lotNumber</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getLotNumberAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(lotNumberCID);
    }


    /**
     * Gets the <code>lotNumber</code> attribute value.
     * @return the value
     *
     * @see #setLotNumber
     * @see #removeLotNumber
     */
    public final int getLotNumber() {
        return getInteger(getLotNumberAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>lotNumber</code> attribute value.
     * @param val the new value
     *
     * @see #getLotNumber
     * @see #removeLotNumber
     */
    public final void setLotNumber(int val) {
        setInteger(getLotNumberAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>lotNumber</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getLotNumber
     * @see #setLotNumber
     */
    public final void removeLotNumber() {
        removeValue(getLotNumberAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getLotNumber
     * @see #setLotNumber
     */
    public final boolean isLotNumberDefaultValue() {
        return isDefaultValue(getLotNumberAttribute(getMtDatabase()));
    }


    /* Attribute 'artistName' */

    /** Attribute <code>artistName</code> cache ID */
    private static int artistNameCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("artistName",CID));

    /**
     * Gets the <code>artistName</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getArtistNameAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(artistNameCID);
    }


    /**
     * Gets the <code>artistName</code> attribute value.
     * @return the value
     *
     * @see #setArtistName
     * @see #removeArtistName
     */
    public final String getArtistName() {
        return getString(getArtistNameAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>artistName</code> attribute value.
     * @param val the new value
     *
     * @see #getArtistName
     * @see #removeArtistName
     */
    public final void setArtistName(String val) {
        setString(getArtistNameAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>artistName</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getArtistName
     * @see #setArtistName
     */
    public final void removeArtistName() {
        removeValue(getArtistNameAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getArtistName
     * @see #setArtistName
     */
    public final boolean isArtistNameDefaultValue() {
        return isDefaultValue(getArtistNameAttribute(getMtDatabase()));
    }


    /* Attribute 'itemproducedDate' */

    /** Attribute <code>itemproducedDate</code> cache ID */
    private static int itemproducedDateCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("itemproducedDate",CID));

    /**
     * Gets the <code>itemproducedDate</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getItemproducedDateAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(itemproducedDateCID);
    }


    /**
     * Gets the <code>itemproducedDate</code> attribute value.
     * @return the value
     *
     * @see #setItemproducedDate
     * @see #removeItemproducedDate
     */
    public final String getItemproducedDate() {
        return getString(getItemproducedDateAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>itemproducedDate</code> attribute value.
     * @param val the new value
     *
     * @see #getItemproducedDate
     * @see #removeItemproducedDate
     */
    public final void setItemproducedDate(String val) {
        setString(getItemproducedDateAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>itemproducedDate</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getItemproducedDate
     * @see #setItemproducedDate
     */
    public final void removeItemproducedDate() {
        removeValue(getItemproducedDateAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getItemproducedDate
     * @see #setItemproducedDate
     */
    public final boolean isItemproducedDateDefaultValue() {
        return isDefaultValue(getItemproducedDateAttribute(getMtDatabase()));
    }


    /* Attribute 'classification' */

    /** Attribute <code>classification</code> cache ID */
    private static int classificationCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("classification",CID));

    /**
     * Gets the <code>classification</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getClassificationAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(classificationCID);
    }


    /**
     * Gets the <code>classification</code> attribute value.
     * @return the value
     *
     * @see #setClassification
     * @see #removeClassification
     */
    public final String getClassification() {
        return getString(getClassificationAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>classification</code> attribute value.
     * @param val the new value
     *
     * @see #getClassification
     * @see #removeClassification
     */
    public final void setClassification(String val) {
        setString(getClassificationAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>classification</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getClassification
     * @see #setClassification
     */
    public final void removeClassification() {
        removeValue(getClassificationAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getClassification
     * @see #setClassification
     */
    public final boolean isClassificationDefaultValue() {
        return isDefaultValue(getClassificationAttribute(getMtDatabase()));
    }


    /* Attribute 'description' */

    /** Attribute <code>description</code> cache ID */
    private static int descriptionCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("description",CID));

    /**
     * Gets the <code>description</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getDescriptionAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(descriptionCID);
    }


    /**
     * Gets the <code>description</code> attribute value.
     * @return the value
     *
     * @see #setDescription
     * @see #removeDescription
     */
    public final String getDescription() {
        return getString(getDescriptionAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>description</code> attribute value.
     * @param val the new value
     *
     * @see #getDescription
     * @see #removeDescription
     */
    public final void setDescription(String val) {
        setString(getDescriptionAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>description</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getDescription
     * @see #setDescription
     */
    public final void removeDescription() {
        removeValue(getDescriptionAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getDescription
     * @see #setDescription
     */
    public final boolean isDescriptionDefaultValue() {
        return isDefaultValue(getDescriptionAttribute(getMtDatabase()));
    }


    /* Attribute 'auctionDate' */

    /** Attribute <code>auctionDate</code> cache ID */
    private static int auctionDateCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("auctionDate",CID));

    /**
     * Gets the <code>auctionDate</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getAuctionDateAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(auctionDateCID);
    }


    /**
     * Gets the <code>auctionDate</code> attribute value.
     * @return the value
     *
     * @see #setAuctionDate
     * @see #removeAuctionDate
     */
    public final String getAuctionDate() {
        return getString(getAuctionDateAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>auctionDate</code> attribute value.
     * @param val the new value
     *
     * @see #getAuctionDate
     * @see #removeAuctionDate
     */
    public final void setAuctionDate(String val) {
        setString(getAuctionDateAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>auctionDate</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getAuctionDate
     * @see #setAuctionDate
     */
    public final void removeAuctionDate() {
        removeValue(getAuctionDateAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getAuctionDate
     * @see #setAuctionDate
     */
    public final boolean isAuctionDateDefaultValue() {
        return isDefaultValue(getAuctionDateAttribute(getMtDatabase()));
    }


    /* Attribute 'estimated_price' */

    /** Attribute <code>estimated_price</code> cache ID */
    private static int estimated_priceCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("estimated_price",CID));

    /**
     * Gets the <code>estimated_price</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getEstimated_priceAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(estimated_priceCID);
    }


    /**
     * Gets the <code>estimated_price</code> attribute value.
     * @return the value
     *
     * @see #setEstimated_price
     * @see #removeEstimated_price
     */
    public final String getEstimated_price() {
        return getString(getEstimated_priceAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>estimated_price</code> attribute value.
     * @param val the new value
     *
     * @see #getEstimated_price
     * @see #removeEstimated_price
     */
    public final void setEstimated_price(String val) {
        setString(getEstimated_priceAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>estimated_price</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getEstimated_price
     * @see #setEstimated_price
     */
    public final void removeEstimated_price() {
        removeValue(getEstimated_priceAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getEstimated_price
     * @see #setEstimated_price
     */
    public final boolean isEstimated_priceDefaultValue() {
        return isDefaultValue(getEstimated_priceAttribute(getMtDatabase()));
    }


    /* Attribute 'sellStatus' */

    /** Attribute <code>sellStatus</code> cache ID */
    private static int sellStatusCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("sellStatus",CID));

    /**
     * Gets the <code>sellStatus</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getSellStatusAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(sellStatusCID);
    }


    /**
     * Gets the <code>sellStatus</code> attribute value.
     * @return the value
     *
     * @see #setSellStatus
     * @see #removeSellStatus
     */
    public final String getSellStatus() {
        return getString(getSellStatusAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>sellStatus</code> attribute value.
     * @param val the new value
     *
     * @see #getSellStatus
     * @see #removeSellStatus
     */
    public final void setSellStatus(String val) {
        setString(getSellStatusAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>sellStatus</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getSellStatus
     * @see #setSellStatus
     */
    public final void removeSellStatus() {
        removeValue(getSellStatusAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getSellStatus
     * @see #setSellStatus
     */
    public final boolean isSellStatusDefaultValue() {
        return isDefaultValue(getSellStatusAttribute(getMtDatabase()));
    }


    /* Attribute 'itemImage' */

    /** Attribute <code>itemImage</code> cache ID */
    private static int itemImageCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("itemImage",CID));

    /**
     * Gets the <code>itemImage</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getItemImageAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(itemImageCID);
    }


    /**
     * Gets the <code>itemImage</code> attribute value.
     * @return the value
     *
     * @see #setItemImage
     * @see #removeItemImage
     */
    public final byte[] getItemImage() {
        return getImage(getItemImageAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>itemImage</code> attribute value.
     * @param val the new value
     *
     * @see #getItemImage
     * @see #removeItemImage
     */
    public final void setItemImage(byte[] val) {
        setImage(getItemImageAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>itemImage</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getItemImage
     * @see #setItemImage
     */
    public final void removeItemImage() {
        removeValue(getItemImageAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getItemImage
     * @see #setItemImage
     */
    public final boolean isItemImageDefaultValue() {
        return isDefaultValue(getItemImageAttribute(getMtDatabase()));
    }

    /**
     * Gets the <code>itemImage</code> attribute list size.
     * @return the number of elements in the list
     *
     * @see #setItemImageElements
     * @see #getItemImageElements
     */
    public final long getItemImageSize() {
        return getListSize(getItemImageAttribute(getMtDatabase()));
    }

    /**
     * Reads <code>itemImage</code> attribute value elements into a portion of an array.
     * @param value destination buffer
     * @param offset offset at which to start storing elements
     * @param len the maximum number of elements to read
     * @return the number of elements read
     *
     * @see #setItemImageElements
     * @see #getItemImageSize
     */
    public final int getItemImageElements(byte[] value, long offset, int len) {
        return getImageElements(getItemImageAttribute(getMtDatabase()), value, len, offset);
    }

    /**
     * Writes a portion of an array of elements to the <code>itemImage</code> attribute value.
     * @param value an array of elements
     * @param offset offset from which to start writing characters
     * @param len number of characters to write
     * @param discardAfter truncate the remaining part of the attribute
     *
     * @see #getItemImageElements
     * @see #getItemImageSize
     */
    public final void setItemImageElements(byte[] value, long offset, int len, boolean discardAfter) {
        setImageElements(getItemImageAttribute(getMtDatabase()), value, len, offset, discardAfter);
    }


    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public Item(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[Item]";
    }
}
