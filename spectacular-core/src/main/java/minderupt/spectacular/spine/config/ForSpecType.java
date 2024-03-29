/*
 * XML Type:  for-specType
 * Namespace: 
 * Java type: minderupt.spectacular.spine.config.ForSpecType
 *
 * Automatically generated - do not modify.
 */
package minderupt.spectacular.spine.config;


/**
 * An XML for-specType(@).
 *
 * This is a complex type.
 */
public interface ForSpecType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ForSpecType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s93CAFC5FADEA884A9CDF9B356A957356").resolveHandle("forspectypea302type");
    
    /**
     * Gets array of all "option" elements
     */
    minderupt.spectacular.spine.config.OptionType[] getOptionArray();
    
    /**
     * Gets ith "option" element
     */
    minderupt.spectacular.spine.config.OptionType getOptionArray(int i);
    
    /**
     * Returns number of "option" element
     */
    int sizeOfOptionArray();
    
    /**
     * Sets array of all "option" element
     */
    void setOptionArray(minderupt.spectacular.spine.config.OptionType[] optionArray);
    
    /**
     * Sets ith "option" element
     */
    void setOptionArray(int i, minderupt.spectacular.spine.config.OptionType option);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "option" element
     */
    minderupt.spectacular.spine.config.OptionType insertNewOption(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "option" element
     */
    minderupt.spectacular.spine.config.OptionType addNewOption();
    
    /**
     * Removes the ith "option" element
     */
    void removeOption(int i);
    
    /**
     * Gets the "spec" attribute
     */
    java.lang.String getSpec();
    
    /**
     * Gets (as xml) the "spec" attribute
     */
    org.apache.xmlbeans.XmlString xgetSpec();
    
    /**
     * True if has "spec" attribute
     */
    boolean isSetSpec();
    
    /**
     * Sets the "spec" attribute
     */
    void setSpec(java.lang.String spec);
    
    /**
     * Sets (as xml) the "spec" attribute
     */
    void xsetSpec(org.apache.xmlbeans.XmlString spec);
    
    /**
     * Unsets the "spec" attribute
     */
    void unsetSpec();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static minderupt.spectacular.spine.config.ForSpecType newInstance() {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static minderupt.spectacular.spine.config.ForSpecType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static minderupt.spectacular.spine.config.ForSpecType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static minderupt.spectacular.spine.config.ForSpecType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (minderupt.spectacular.spine.config.ForSpecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
