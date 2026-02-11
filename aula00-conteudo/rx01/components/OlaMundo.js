import React from 'react';
import { View,Text } from 'react-native-web';
export default function OlaMundo(props){
    return(
        <View>
            <text>{props.nome}!</text>
        </View>
    );
}