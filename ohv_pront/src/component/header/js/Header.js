import React from 'react';
import '../scss/Header.scss'
const Header = () => {
    return (
        <>
            <section className="headerNav">
                <div className="headerLogo">
                </div>
                <nav>
                    <ul className="headerMenu">
                        <li><a href="/">홈</a></li>
                        <li><a href="/">메뉴</a></li>
                        <li><a href="/">도감</a></li>
                        <li><a href="/">가이드</a></li>
                    </ul>
                </nav>
                <div className="headerLogin">
                    <div className="headerLoginIcon"></div>
                </div>
            </section>
        </>
    );
};

export default Header;