import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Register from './compoment/Register';
import Login from './compoment/Login';
import { BrowserRouter, Route, Link } from "react-router-dom";
import * as serviceWorker from './serviceWorker';
import Aos from 'aos';
ReactDOM.render(

	(
   <BrowserRouter >
      <Route path = "/" component = {Login}>
         <Route path = "/login" component = {Login} />
         <Route path = "/register" component = {Register} />
      </Route>
   </BrowserRouter>
	)
	, document.getElementById('k-form'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.register();
