import React from 'react';

import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  Button,
  TextInput,
  NativeModules
} from 'react-native';

class HelloWorld extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      toast: ''
    }
  }

  onChangeToast = (value) => {
    this.setState({
      toast: value
    })
  }
  
  showToast = () => {
    const { toast } = this.state;
    NativeModules.ToastExample.show(toast, NativeModules.ToastExample.SHORT);
  }

  startVideo = () => {
    NativeModules.ActivityStarter.navigateToVideo();
  }

  render() {
    const { toast } = this.state;
    return (
      <View style={styles.container}>
        <Text style={styles.hello}>Welcome, from React Native</Text>
        <View style={{width: 300, marginLeft: 'auto', marginRight: 'auto'}}>
          <Button onPress={this.startVideo} title="Start Video"></Button>
          <TextInput value={toast} onChangeText={this.onChangeToast}
            style={{borderColor: 'grey', borderWidth: 1, marginBottom: 5, marginTop: 10}}>
          </TextInput>
          <Button onPress={this.showToast} title="Show Toast"></Button>
        </View>
      </View>
    );
  }
}
var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center'
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10
  }
});

AppRegistry.registerComponent(
  'MyReactNativeApp',
  () => HelloWorld
);