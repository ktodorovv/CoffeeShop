package com.coffee.shop.utils.interfaces;

import java.util.List;

import org.modelmapper.PropertyMap;

public interface ModelParser {

    <S,D> D convert(S source, Class<D> destinationClass);

    <S,D> D convert(S source, Class<D> destinationClass, PropertyMap<S, D> propertyMap);
    
    <S,D> List<D> convert(List<S> sourceList, Class<D> destinationClass);
}
