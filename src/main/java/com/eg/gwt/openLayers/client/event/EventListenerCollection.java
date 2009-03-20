package com.eg.gwt.openLayers.client.event;

import java.util.HashMap;
import java.util.Map;

import com.eg.gwt.openLayers.client.OpenLayersObjectWrapper;

/**
 * The EventListenerCollection serves to maintain references to EventListeners, and
 * keeps hold of the properties necessary to unregister EventListeners.
 *
 * When an EventListener is added to the EventListener collection it is passed all
 * the information to add it as a listener for events a particular widget fires.
 *
 * @author Edwin Commandeur - Atlis EJS
 *
 */
public class EventListenerCollection {

    private Map map = new HashMap();

    public void addListener(OpenLayersObjectWrapper w, EventListener listener, String type, EventHandler handler){
        //TODO check if type is defined and valid?
        w.getEvents().register(type, w, handler);
        addToCollection(listener, new ListenerRegisteredProperties(type, handler));
    }

    public void removeListener(OpenLayersObjectWrapper w, EventListener listener){
        ListenerRegisteredProperties props = getRegisteredProperties(listener);
        if(props!=null){
            w.getEvents().unregister(props.getType(), w, props.getEventHandler());
            removeRegisteredProperties(listener);
        }
        //TODO give feedback that listener is not in collection
    }

//EventListenerCollection is propery of object, so removing all listeners
// means clearing the complete map (is calling map.clear() enough?)
/*
    public void removeListeners(OpenLayersObjectWrapper w){
        int size = map.size();
        if(size > 0){
            for(int i = 0;i< size;i++){

            }
        }
    }
*/
    private void addToCollection(EventListener listener, ListenerRegisteredProperties props){
        map.put(listener, props);
    }

    private ListenerRegisteredProperties getRegisteredProperties(EventListener listener){
        return (ListenerRegisteredProperties) map.get(listener);
    }

    private void removeRegisteredProperties(EventListener listener){
        map.remove(listener);
    }


    private class ListenerRegisteredProperties {
        String type;
        EventHandler handler;

        ListenerRegisteredProperties(String type, EventHandler handler){
            this.type = type;
            this.handler = handler;
        }

        String getType(){
            return this.type;
        }

        EventHandler getEventHandler(){
            return this.handler;
        }
    }
}
