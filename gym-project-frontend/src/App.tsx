import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './components/Header';
import Footer from './components/Footer';
import Home from './pages/Home';
import Services from './pages/Services';
import Contact from './pages/Contact';
import Trainers from './pages/Trainers';
import './styles/App.css';

function App() {
  return (
    <Router>
      <div className="App">
        <Header />
        <main className="main-content">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/services" element={<Services />} />
            <Route path="/contact" element={<Contact />} />
            {/* Placeholder routes for future pages */}
            <Route path="/trainers" element={<Trainers />} />
            <Route path="/membership" element={<div className="page-placeholder"><h1>Üyelik Sayfası</h1><p>Bu sayfa yakında gelecek!</p></div>} />
            <Route path="/login" element={<div className="page-placeholder"><h1>Giriş Sayfası</h1><p>Bu sayfa yakında gelecek!</p></div>} />
            <Route path="/register" element={<div className="page-placeholder"><h1>Kayıt Sayfası</h1><p>Bu sayfa yakında gelecek!</p></div>} />
          </Routes>
        </main>
        <Footer />
      </div>
    </Router>
  );
}

export default App;
