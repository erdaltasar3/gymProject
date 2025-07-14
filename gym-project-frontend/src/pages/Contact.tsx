import React, { useState } from 'react';
import './Contact.css';

const Contact: React.FC = () => {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    phone: '',
    subject: '',
    message: ''
  });

  const handleChange = (e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement>) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    // Form gönderme işlemi burada yapılacak
    console.log('Form gönderildi:', formData);
    alert('Mesajınız başarıyla gönderildi! En kısa sürede dönüş yapacağız.');
    setFormData({
      name: '',
      email: '',
      phone: '',
      subject: '',
      message: ''
    });
  };

  return (
    <div className="contact">
      <div className="contact-hero">
        <div className="container">
          <h1>İletişim</h1>
          <p>Bizimle iletişime geçin, size en iyi hizmeti sunalım!</p>
        </div>
      </div>

      <div className="contact-content">
        <div className="container">
          <div className="contact-grid">
            {/* İletişim Bilgileri */}
            <div className="contact-info">
              <h2>Bize Ulaşın</h2>
              <div className="info-item">
                <div className="info-icon">📍</div>
                <div className="info-text">
                  <h3>Adres</h3>
                  <p>Atatürk Bulvarı No:123<br />Kadıköy, İstanbul 34710</p>
                </div>
              </div>

              <div className="info-item">
                <div className="info-icon">📞</div>
                <div className="info-text">
                  <h3>Telefon</h3>
                  <p>+90 212 555 0123<br />+90 532 555 0123</p>
                </div>
              </div>

              <div className="info-item">
                <div className="info-icon">✉️</div>
                <div className="info-text">
                  <h3>E-posta</h3>
                  <p>info@fitzone.com<br />destek@fitzone.com</p>
                </div>
              </div>

              <div className="info-item">
                <div className="info-icon">🕒</div>
                <div className="info-text">
                  <h3>Çalışma Saatleri</h3>
                  <p>Pazartesi - Pazar<br />06:00 - 24:00</p>
                </div>
              </div>

              <div className="social-section">
                <h3>Sosyal Medya</h3>
                <div className="social-links">
                  <a href="#" className="social-link">📘 Facebook</a>
                  <a href="#" className="social-link">📷 Instagram</a>
                  <a href="#" className="social-link">🐦 Twitter</a>
                  <a href="#" className="social-link">📺 YouTube</a>
                </div>
              </div>
            </div>

            {/* İletişim Formu */}
            <div className="contact-form">
              <h2>Mesaj Gönderin</h2>
              <form onSubmit={handleSubmit}>
                <div className="form-group">
                  <label htmlFor="name">Ad Soyad *</label>
                  <input
                    type="text"
                    id="name"
                    name="name"
                    value={formData.name}
                    onChange={handleChange}
                    required
                  />
                </div>

                <div className="form-row">
                  <div className="form-group">
                    <label htmlFor="email">E-posta *</label>
                    <input
                      type="email"
                      id="email"
                      name="email"
                      value={formData.email}
                      onChange={handleChange}
                      required
                    />
                  </div>

                  <div className="form-group">
                    <label htmlFor="phone">Telefon</label>
                    <input
                      type="tel"
                      id="phone"
                      name="phone"
                      value={formData.phone}
                      onChange={handleChange}
                    />
                  </div>
                </div>

                <div className="form-group">
                  <label htmlFor="subject">Konu *</label>
                  <select
                    id="subject"
                    name="subject"
                    value={formData.subject}
                    onChange={handleChange}
                    required
                  >
                    <option value="">Konu seçiniz</option>
                    <option value="membership">Üyelik Bilgileri</option>
                    <option value="training">Antrenman Programları</option>
                    <option value="pricing">Fiyat Bilgileri</option>
                    <option value="complaint">Şikayet/Öneri</option>
                    <option value="other">Diğer</option>
                  </select>
                </div>

                <div className="form-group">
                  <label htmlFor="message">Mesaj *</label>
                  <textarea
                    id="message"
                    name="message"
                    rows={5}
                    value={formData.message}
                    onChange={handleChange}
                    required
                  ></textarea>
                </div>

                <button type="submit" className="btn btn-primary">
                  Mesaj Gönder
                </button>
              </form>
            </div>
          </div>
        </div>
      </div>

      {/* Harita Bölümü */}
      <div className="map-section">
        <div className="container">
          <h2>Konumumuz</h2>
          <div className="map-placeholder">
            <p>🗺️ Google Maps Haritası</p>
            <p>Atatürk Bulvarı No:123, Kadıköy, İstanbul</p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Contact;
