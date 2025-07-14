import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import './Header.css';

const Header: React.FC = () => {
  const [isMenuOpen, setIsMenuOpen] = useState(false);

  const toggleMenu = () => {
    setIsMenuOpen(!isMenuOpen);
  };

  return (
    <header className="header">
      <div className="container">
        <div className="header-content">
          <div className="logo">
            <Link to="/">
              <h2>💪 FitZone</h2>
            </Link>
          </div>
          
          <nav className={`nav ${isMenuOpen ? 'nav-open' : ''}`}>
            <ul className="nav-list">
              <li><Link to="/" onClick={() => setIsMenuOpen(false)}>Ana Sayfa</Link></li>
              <li><Link to="/services" onClick={() => setIsMenuOpen(false)}>Hizmetler</Link></li>
              <li><Link to="/trainers" onClick={() => setIsMenuOpen(false)}>Antrenörler</Link></li>
              <li><Link to="/membership" onClick={() => setIsMenuOpen(false)}>Üyelik</Link></li>
              <li><Link to="/contact" onClick={() => setIsMenuOpen(false)}>İletişim</Link></li>
              <li><Link to="/contact" onClick={() => setIsMenuOpen(false)}>Salonlarımız</Link></li>
              <li><Link to="/contact" onClick={() => setIsMenuOpen(false)}>Erdalı seviyorum</Link></li>

            </ul>
          </nav>

          <div className="header-actions">
            <Link to="/login" className="btn btn-secondary">Giriş Yap</Link>
            <Link to="/register" className="btn btn-primary">Üye Ol</Link>
          </div>

          <button 
            className={`menu-toggle ${isMenuOpen ? 'menu-open' : ''}`}
            onClick={toggleMenu}
            aria-label="Menüyü aç/kapat"
          >
            <span></span>
            <span></span>
            <span></span>
          </button>
        </div>
      </div>
    </header>
  );
};

export default Header;
