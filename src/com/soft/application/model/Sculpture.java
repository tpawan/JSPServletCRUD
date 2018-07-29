package com.soft.application.model;
/*

 * Sculpture.java
 *
 * Generated with Matisse Schema Definition Language 9.1.10
 * Generation date: Sat Apr 07 17:57:56 2018
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

import com.matisse.reflect.*;

/**
 * <code>Sculpture</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class Sculpture extends Item {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.10
     * Generation Date: Sat Apr 07 17:57:56 2018
     */

    /*
     * Class variables and methods
     */

    /** Class <code>Sculpture</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("Sculpture"));

    /**
     * Gets the <code>Sculpture</code> class descriptor.
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
    public Sculpture(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected Sculpture(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(Sculpture.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, Sculpture.class);
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
        return getClass(db).<E>ownInstanceIterator(Sculpture.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, Sculpture.class);
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

    /* Attribute 'materialUsed' */

    /** Attribute <code>materialUsed</code> cache ID */
    private static int materialUsedCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("materialUsed",CID));

    /**
     * Gets the <code>materialUsed</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getMaterialUsedAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(materialUsedCID);
    }


    /**
     * Gets the <code>materialUsed</code> attribute value.
     * @return the value
     *
     * @see #setMaterialUsed
     * @see #removeMaterialUsed
     */
    public final String getMaterialUsed() {
        return getString(getMaterialUsedAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>materialUsed</code> attribute value.
     * @param val the new value
     *
     * @see #getMaterialUsed
     * @see #removeMaterialUsed
     */
    public final void setMaterialUsed(String val) {
        setString(getMaterialUsedAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>materialUsed</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getMaterialUsed
     * @see #setMaterialUsed
     */
    public final void removeMaterialUsed() {
        removeValue(getMaterialUsedAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getMaterialUsed
     * @see #setMaterialUsed
     */
    public final boolean isMaterialUsedDefaultValue() {
        return isDefaultValue(getMaterialUsedAttribute(getMtDatabase()));
    }


    /* Attribute 'height' */

    /** Attribute <code>height</code> cache ID */
    private static int heightCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("height",CID));

    /**
     * Gets the <code>height</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getHeightAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(heightCID);
    }


    /**
     * Gets the <code>height</code> attribute value.
     * @return the value
     *
     * @see #setHeight
     * @see #removeHeight
     */
    public final double getHeight() {
        return getDouble(getHeightAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>height</code> attribute value.
     * @param val the new value
     *
     * @see #getHeight
     * @see #removeHeight
     */
    public final void setHeight(double val) {
        setDouble(getHeightAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>height</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getHeight
     * @see #setHeight
     */
    public final void removeHeight() {
        removeValue(getHeightAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getHeight
     * @see #setHeight
     */
    public final boolean isHeightDefaultValue() {
        return isDefaultValue(getHeightAttribute(getMtDatabase()));
    }


    /* Attribute 'length' */

    /** Attribute <code>length</code> cache ID */
    private static int lengthCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("length",CID));

    /**
     * Gets the <code>length</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getLengthAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(lengthCID);
    }


    /**
     * Gets the <code>length</code> attribute value.
     * @return the value
     *
     * @see #setLength
     * @see #removeLength
     */
    public final double getLength() {
        return getDouble(getLengthAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>length</code> attribute value.
     * @param val the new value
     *
     * @see #getLength
     * @see #removeLength
     */
    public final void setLength(double val) {
        setDouble(getLengthAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>length</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getLength
     * @see #setLength
     */
    public final void removeLength() {
        removeValue(getLengthAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getLength
     * @see #setLength
     */
    public final boolean isLengthDefaultValue() {
        return isDefaultValue(getLengthAttribute(getMtDatabase()));
    }


    /* Attribute 'width' */

    /** Attribute <code>width</code> cache ID */
    private static int widthCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("width",CID));

    /**
     * Gets the <code>width</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getWidthAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(widthCID);
    }


    /**
     * Gets the <code>width</code> attribute value.
     * @return the value
     *
     * @see #setWidth
     * @see #removeWidth
     */
    public final double getWidth() {
        return getDouble(getWidthAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>width</code> attribute value.
     * @param val the new value
     *
     * @see #getWidth
     * @see #removeWidth
     */
    public final void setWidth(double val) {
        setDouble(getWidthAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>width</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getWidth
     * @see #setWidth
     */
    public final void removeWidth() {
        removeValue(getWidthAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getWidth
     * @see #setWidth
     */
    public final boolean isWidthDefaultValue() {
        return isDefaultValue(getWidthAttribute(getMtDatabase()));
    }


    /* Attribute 'weight' */

    /** Attribute <code>weight</code> cache ID */
    private static int weightCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("weight",CID));

    /**
     * Gets the <code>weight</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getWeightAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(weightCID);
    }


    /**
     * Gets the <code>weight</code> attribute value.
     * @return the value
     *
     * @see #setWeight
     * @see #removeWeight
     */
    public final double getWeight() {
        return getDouble(getWeightAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>weight</code> attribute value.
     * @param val the new value
     *
     * @see #getWeight
     * @see #removeWeight
     */
    public final void setWeight(double val) {
        setDouble(getWeightAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>weight</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getWeight
     * @see #setWeight
     */
    public final void removeWeight() {
        removeValue(getWeightAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getWeight
     * @see #setWeight
     */
    public final boolean isWeightDefaultValue() {
        return isDefaultValue(getWeightAttribute(getMtDatabase()));
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
    public Sculpture(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[Sculpture]";
    }
}
