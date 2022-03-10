import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css'

function Navbar() {    
    return(
    <header>
      <nav className="container">
        <div className="plmovie-nav-content">
          <h1>PL Movie</h1>
          <a href="https://github.com/pedroveppo/plmovie" target="_blank" rel="noreferrer">
            <div className="plmovie-contact-container">
             <GithubIcon />
             <p className="plmovie-contact-link">/pedroveppo/plmovie</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
    )
}


export default Navbar;