/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View
} from 'react-native';
import DemoModule from 'react-native-toast-demo';

const onButtonPress = () => {
  DemoModule.alert('Hello World');
};

export default class App extends Component<{}> {
  render() {
    return (
      <View style={styles.container}>
        <Button title='Click' onPress={onButtonPress}/>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  }
});
