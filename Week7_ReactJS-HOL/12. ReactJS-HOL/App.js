import React, { useState } from 'react';

function App() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');

  return (
    <div>
      <h2>Simple Registration</h2>
      <input 
        type="text" 
        placeholder="Enter name" 
        value={name}
        onChange={(e) => setName(e.target.value)}
      /><br /><br />
      <input 
        type="email" 
        placeholder="Enter email" 
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      /><br /><br />
      <p>Name: {name}</p>
      <p>Email: {email}</p>
    </div>
  );
}

export default App;
