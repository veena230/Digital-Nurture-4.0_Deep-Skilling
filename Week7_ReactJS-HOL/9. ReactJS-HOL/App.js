import React, { useState } from 'react';

function App() {
  const [darkMode, setDarkMode] = useState(false);

  const appStyle = {
    backgroundColor: darkMode ? '#121212' : '#ffffff',
    color: darkMode ? '#ffffff' : '#000000',
    minHeight: '100vh',
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    flexDirection: 'column'
  };

  return (
    <div style={appStyle}>
      <h2>{darkMode ? 'Dark Mode' : 'Light Mode'}</h2>
      <button onClick={() => setDarkMode(!darkMode)}>
        Toggle Mode
      </button>
    </div>
  );
}

export default App;
