import './App.css';
import { Link, Route, Routes } from 'react-router-dom';
import Navbar from './components/navbar';
import Home from './pages/Home';
import Add from './pages/Add';
import Maintain from './pages/Maintain';


function App() {
  return (
    <div className='App'>
      <><Navbar /><Routes>
      <Route path="" element={ <Home /> } />
      <Route path="lisa" element={ <Add /> } />
      <Route path="halda" element={ <Maintain /> } />
      <Route path="ostukorv" element={<div>Olen OSTUKORV lehel</div>} />
    </Routes></>
    </div>
  );
}

export default App;
