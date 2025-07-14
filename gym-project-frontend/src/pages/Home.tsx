import React from 'react';
import { Link } from 'react-router-dom';
import './Home.css';

const Home: React.FC = () => {
  return (
    <div className="home">
      {/* Hero Section */}
      <section className="hero">
        <div className="hero-content">
          <h1>Güçlü Olma Zamanı! 💪</h1>
          <p>Modern spor salonu deneyimi ile hedeflerinize ulaşın. Profesyonel antrenörler ve son teknoloji ekipmanlarla fit yaşamı başlatın.</p>
          <div className="hero-buttons">
            <Link to="/register" className="btn btn-primary">Ücretsiz Deneme</Link>
            <Link to="/services" className="btn btn-secondary">Hizmetleri Keşfet</Link>
          </div>
        </div>
        <div className="hero-image">
          <div className="hero-placeholder">🏋️‍♂️</div>
        </div>
      </section>

      {/* Features Section */}
      <section className="features">
        <div className="container">
          <h2>Neden FitZone?</h2>
          <div className="features-grid">
            <div className="feature-card">
              <div className="feature-icon">🏃‍♀️</div>
              <h3>Modern Ekipmanlar</h3>
              <p>Son teknoloji fitness ekipmanları ile güvenli ve etkili antrenman deneyimi</p>
            </div>
            <div className="feature-card">
              <div className="feature-icon">👨‍⚕️</div>
              <h3>Uzman Antrenörler</h3>
              <p>Sertifikalı ve deneyimli antrenörlerden kişisel program desteği</p>
            </div>
            <div className="feature-card">
              <div className="feature-icon">🕒</div>
              <h3>Esnek Saatler</h3>
              <p>Hafta içi ve hafta sonu 06:00-24:00 arası kesintisiz hizmet</p>
            </div>
            <div className="feature-card">
              <div className="feature-icon">🍎</div>
              <h3>Beslenme Desteği</h3>
              <p>Uzman diyetisyen eşliğinde kişisel beslenme programları</p>
            </div>
          </div>
        </div>
      </section>

      {/* Services Preview */}
      <section className="services-preview">
        <div className="container">
          <h2>Hizmetlerimiz</h2>
          <div className="services-grid">
            <div className="service-card">
              <h3>🏋️ Kişisel Antrenman</h3>
              <p>Birebir antrenör desteği ile özel program</p>
              <Link to="/services" className="service-link">Detaylar →</Link>
            </div>
            <div className="service-card">
              <h3>👥 Grup Dersleri</h3>
              <p>Yoga, Pilates, Zumba ve daha fazlası</p>
              <Link to="/services" className="service-link">Detaylar →</Link>
            </div>
            <div className="service-card">
              <h3>🥗 Beslenme Danışmanlığı</h3>
              <p>Hedeflerinize uygun diyet programları</p>
              <Link to="/services" className="service-link">Detaylar →</Link>
            </div>
          </div>
        </div>
      </section>

      {/* Stats Section */}
      <section className="stats">
        <div className="container">
          <div className="stats-grid">
            <div className="stat-item">
              <h3>500+</h3>
              <p>Mutlu Üye</p>
            </div>
            <div className="stat-item">
              <h3>15+</h3>
              <p>Uzman Antrenör</p>
            </div>
            <div className="stat-item">
              <h3>5</h3>
              <p>Yıl Deneyim</p>
            </div>
            <div className="stat-item">
              <h3>24/7</h3>
              <p>Açık Salon</p>
            </div>
          </div>
        </div>
      </section>

      {/* CTA Section */}
      <section className="cta">
        <div className="container">
          <div className="cta-content">
            <h2>Hayalindeki Vücuda Sahip Olmaya Hazır mısın?</h2>
            <p>İlk dersini ücretsiz dene, farkı hemen keşfet!</p>
            <Link to="/contact" className="btn btn-primary">Hemen Başla</Link>
          </div>
        </div>
      </section>
    </div>
  );
};

export default Home;
