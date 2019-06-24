import React from 'react';
class Random extends React.Component {
  constructor(props) {
    super(props);
  }
 
  newRandomValue(event) {
    this.forceUpdate();
  }
 
  render() {
    return (
      <div>
        <button onClick={event => this.newRandomValue(event)}>Random</button>
        <div>Random Value: {Math.random()}</div>
      </div>
    );
  }
}
 
export default Random;