import * as Settings from "expo-lib-sdk";
import { Text, View } from "react-native";

export default function App() {
  return (
    <View style={{ flex: 1, alignItems: "center", justifyContent: "center" }}>
      <Text>Theme: {Settings.getTheme()}</Text>
    </View>
  );
}
