import React from "react";
import { StyleSheet } from "react-native";
import { View } from "react-native";
import OlaMundo from "./components/OlaMundo";

export default function App(){
  return(
    <View style={styles.container}>
    <OlaMundo nome= 'ola mundo'></OlaMundo>
    </View>
  );
}

const styles = StyleSheet.create({
  container:{
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor:'#eee',

  },

  text:{
    fontSize:24,
    fontWeight:'bold',
  },
});