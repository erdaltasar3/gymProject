import React from 'react';
import './Footer.css';

const Footer: React.FC = () => {
  return (
    <footer className="footer">
      <div className="container">
        <div className="footer-content">
          <div className="footer-section">
            <h3>💪 FitZone</h3>
            <p>Modern spor salonu deneyimi için bize katılın. Sağlıklı yaşam tarzınızı başlatın!</p>
            <div className="social-links">
              <a href="#" aria-label="Facebook">📘</a>
              <a href="#" aria-label="Instagram">📷</a>
              <a href="#" aria-label="Twitter">🐦</a>
              <a href="#" aria-label="YouTube">📺</a>
            </div>
          </div>

          <div className="footer-section">
            <h4>Hızlı Linkler</h4>
            <ul>
              <li><a href="/">Ana Sayfa</a></li>
              <li><a href="/services">Hizmetler</a></li>
              <li><a href="/trainers">Antrenörler</a></li>
              <li><a href="/membership">Üyelik Planları</a></li>
            </ul>
          </div>

          <div className="footer-section">
            <h4>Hizmetler</h4>
            <ul>
              <li><a href="#">Kişisel Antrenman</a></li>
              <li><a href="#">Grup Dersleri</a></li>
              <li><a href="#">Beslenme Danışmanlığı</a></li>
              <li><a href="#">Fizik Tedavi</a></li>
            </ul>
          </div>

          <div className="footer-section">
            <h4>İletişim</h4>
            <div className="contact-info">
              <p>📍 Atatürk Bulvarı No:123, İstanbul</p>
              <p>📞 +90 212 555 0123</p>
              <p>✉️ info@fitzone.com</p>
              <p>🕒 Pazartesi-Pazar: 06:00-24:00</p>
            </div>
          </div>
        </div>

        <div className="footer-bottom">
          <div className="footer-bottom-content">
            <p>&copy; 2024 FitZone. Tüm hakları saklıdır.</p>
            <div className="footer-links">
              <a href="/privacy">Gizlilik Politikası</a>
              <a href="/terms">Kullanım Şartları</a>
            </div>
          </div>
        </div>
      </div>
    </footer>
  );
};

export default Footer;
