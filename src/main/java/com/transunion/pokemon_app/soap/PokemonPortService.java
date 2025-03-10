
package com.transunion.pokemon_app.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PokemonPortService", targetNamespace = "http://transunion.com/pokemonapp/soap", wsdlLocation = "http://localhost:8080/ws/pokemones.wsdl")
public class PokemonPortService
    extends Service
{

    private final static URL POKEMONPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException POKEMONPORTSERVICE_EXCEPTION;
    private final static QName POKEMONPORTSERVICE_QNAME = new QName("http://transunion.com/pokemonapp/soap", "PokemonPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/pokemones.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        POKEMONPORTSERVICE_WSDL_LOCATION = url;
        POKEMONPORTSERVICE_EXCEPTION = e;
    }

    public PokemonPortService() {
        super(__getWsdlLocation(), POKEMONPORTSERVICE_QNAME);
    }

    public PokemonPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), POKEMONPORTSERVICE_QNAME, features);
    }

    public PokemonPortService(URL wsdlLocation) {
        super(wsdlLocation, POKEMONPORTSERVICE_QNAME);
    }

    public PokemonPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, POKEMONPORTSERVICE_QNAME, features);
    }

    public PokemonPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PokemonPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PokemonPort
     */
    @WebEndpoint(name = "PokemonPortSoap11")
    public PokemonPort getPokemonPortSoap11() {
        return super.getPort(new QName("http://transunion.com/pokemonapp/soap", "PokemonPortSoap11"), PokemonPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns PokemonPort
     */
    @WebEndpoint(name = "PokemonPortSoap11")
    public PokemonPort getPokemonPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://transunion.com/pokemonapp/soap", "PokemonPortSoap11"), PokemonPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (POKEMONPORTSERVICE_EXCEPTION!= null) {
            throw POKEMONPORTSERVICE_EXCEPTION;
        }
        return POKEMONPORTSERVICE_WSDL_LOCATION;
    }

}
