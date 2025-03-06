
package com.transunion.pokemon_app.soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.transunion.pokemon_app.soap package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.transunion.pokemon_app.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarPokemonesRequest }
     * 
     */
    public BuscarPokemonesRequest createBuscarPokemonesRequest() {
        return new BuscarPokemonesRequest();
    }

    /**
     * Create an instance of {@link BuscarPokemonesResponse }
     * 
     */
    public BuscarPokemonesResponse createBuscarPokemonesResponse() {
        return new BuscarPokemonesResponse();
    }

    /**
     * Create an instance of {@link Pokemon }
     * 
     */
    public Pokemon createPokemon() {
        return new Pokemon();
    }

}
